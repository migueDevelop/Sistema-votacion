// const datos = fetch("http://localhost:8080/estadisticas")
//     .then(res => res.json())
//     .then(data => console.log(data))

// Se procesario un array similar a este
// const fakeData = ordenarDatos([
//     { partido: 'Arena', votos: 250000, color: 'rgb(0, 90, 173)' },
//     { partido: 'FMLN', votos: 370000, color: 'rgb(212, 32, 43)' },
//     { partido: 'Nuevas Ideas', votos: 400000, color: 'rgb(0, 173, 239)' },
//     { partido: 'PDC', votos: 100000, color: 'rgb(0, 116, 42)' },
// ])

// Colores por partido
const coloresBanderas = {
    'Alianza Republicana Nacionalista' : 'rgb(0, 90, 173)',
    'Frente Farabundo Martí para la Liberación Nacional' : 'rgb(212, 32, 43)', // FMLN
    'Gran Alianza por la Unidad Nacional' : '#64cdca', // GANA
    'Partido de Concertación Nacional' : '#1134b5', // PCN
    'Nuevas Ideas' : 'rgb(0, 173, 239)',
}

// Da formato de JSON a Array de objetos para la tabla
const darFormato = (json) => {
    const resultado = Object.keys(json).map(k => {
        return { partido: k, votos: json.k, color: coloresBanderas[k] }
    })
    return resultado
}

// Ordena los datos de forma ascendente
const ordenarDatos = (datos) => datos.sort((p1, p2) => p2.votos - p1.votos)

// Obtiene datos
const obtenerDatos = async () => {
    try {
        const datos = await fetch("http://localhost:8080/estadisticas")
        .then(res => darFormato(res.json()))
        console.log(datos);
        return datos
    } catch (error) {
        console.error("Error: ", error)      
    }
}

const datosOrdenados = darFormato(obtenerDatos())

// console.log('la data: ', fakeData)

const myChart = new Chart(
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