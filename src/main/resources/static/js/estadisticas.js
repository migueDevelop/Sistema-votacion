// Colores por partido
const obtenerColor= partido => {
    const defaultColor = '#d3d3d3'

    const coloresBanderas = {
        'Alianza Republicana Nacionalista' : 'rgb(0, 90, 173)',
        'Frente Farabundo Martí para la Liberación Nacional' : 'rgb(212, 32, 43)', // FMLN
        'Gran Alianza por la Unidad Nacional' : '#64cdca', // GANA
        'Partido de Concertación Nacional' : '#1134b5', // PCN
        'Nuevas Ideas' : 'rgb(0, 173, 239)',
    }

    return coloresBanderas[partido] ?? defaultColor
}

// Da formato de JSON a Array de objetos para la tabla
const darFormato = (json) => {
    const resultado = Object.keys(json).map(k => {
        return { partido: k, votos: json[k], color: obtenerColor(k) }
    })
    return resultado
}

// Ordena los datos de forma ascendente
const ordenarDatos = (datos) => datos.sort((p1, p2) => p2.votos - p1.votos)

// Obtiene datos
const obtenerDatos = () => {
    const data = fetch("http://localhost:8080/estadisticas")
        .then(value => value.json(), error => console.error(error))
    return data
}

const crearGrafico = async () => {
    const datosOrdenados = await ordenarDatos(darFormato(await obtenerDatos()))

    const myChart = await new Chart(
        document.getElementById('grafica'),
        {
            type: 'bar',
            data: {
                labels: datosOrdenados.map(row => row.partido),
                datasets: [{
                    data: datosOrdenados.map(({ votos }) => votos),
                    backgroundColor: datosOrdenados.map(({ color }) => color),
                }]
            },
            options: {
                indexAxis: 'y',
                plugins: { legend: { display: false } }
            }
        }
    )
}

crearGrafico()