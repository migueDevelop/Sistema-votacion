package com.votacion.sistema;

import com.votacion.sistema.models.*;
import com.votacion.sistema.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SistemaDapApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private DepartamentosRepository departamentosRepository;
	@Autowired
	private MunicipiosRepository municipiosRepository;
	@Autowired
	private CentroVotacionRepository centroVotacionRepository;
	@Autowired
	private JRVRepository jrvRepository;
	@Autowired
	private PadronRepository padronRepository;
	@Autowired
	private PartidoRepository partidoRepository;
	@Autowired
	private CandidatoRepository candidatoRepository;
	@Autowired
	private TipoCandidatoRepository tipoCandidatoRepository;
	@Autowired
	private PapeletaRepository papeletaRepository;
	@Autowired
	private VotoRepository votoRepository;

	public static void main(String[] args) {
		SpringApplication.run(SistemaDapApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		saveUsuarios();
//		saveDepa();
//		saveMuni();
//		saveCentros();
//		saveJrv();
//		savePadron();
//		savePartido();
//		saveCandidato();
//		saveTipoCandidato();
//		savePapeleta();
//		saveUsuarioPapeleta();

//		 deletePapeletas();
//		 deleteVotos();
//		 deleteUsuarios();
	}

	private void saveDepa() {
		Departamentos departamentos1 = new Departamentos();
		departamentos1.setNombre("San Salvador");
		departamentosRepository.save(departamentos1);

		Departamentos departamentos2 = new Departamentos();
		departamentos2.setNombre("San Miguel");
		departamentosRepository.save(departamentos2);

		Departamentos departamentos3 = new Departamentos();
		departamentos3.setNombre("La libertad");
		departamentosRepository.save(departamentos3);

		Departamentos departamentos4 = new Departamentos();
		departamentos4.setNombre("Santa Ana");
		departamentosRepository.save(departamentos4);

		Departamentos departamentos5 = new Departamentos();
		departamentos5.setNombre("Chalatenango");
		departamentosRepository.save(departamentos5);
	}

	private void saveMuni() {

		Departamentos sanSalvador = departamentosRepository.getReferenceById(1);

		Municipios municipios1 = new Municipios();
		municipios1.setNombre("Apopa");
		municipios1.setDepartamento(sanSalvador);
		municipiosRepository.save(municipios1);

		Municipios municipios2 = new Municipios();
		municipios2.setNombre("San Martin");
		municipios2.setDepartamento(sanSalvador);
		municipiosRepository.save(municipios2);

		Municipios municipios3 = new Municipios();
		municipios3.setNombre("Aguilares");
		municipios3.setDepartamento(sanSalvador);
		municipiosRepository.save(municipios3);

		Municipios municipios4 = new Municipios();
		municipios4.setNombre("Soyapango");
		municipios4.setDepartamento(sanSalvador);
		municipiosRepository.save(municipios4);

		Municipios municipios5 = new Municipios();
		municipios5.setNombre("San Marcos");
		municipios5.setDepartamento(sanSalvador);
		municipiosRepository.save(municipios5);
	}

	private void saveCentros() {

		Municipios sanMarcos = municipiosRepository.getReferenceById(5);

		CentroVotacion centroVotacion1 = new CentroVotacion();
		centroVotacion1.setNombre("Complejo Educativo San Lorenzo");
		centroVotacion1.setMunicipio(sanMarcos);
		centroVotacionRepository.save(centroVotacion1);

		CentroVotacion centroVotacion2 = new CentroVotacion();
		centroVotacion2.setNombre("Teatro Municipal Gustavo Alfonzo");
		centroVotacion2.setMunicipio(sanMarcos);
		centroVotacionRepository.save(centroVotacion2);

		CentroVotacion centroVotacion3 = new CentroVotacion();
		centroVotacion3.setNombre("Centro Escolar Miguel Garcia 1932");
		centroVotacion3.setMunicipio(sanMarcos);
		centroVotacionRepository.save(centroVotacion3);

		CentroVotacion centroVotacion4 = new CentroVotacion();
		centroVotacion4.setNombre("Avenida 23 Colonia Boliviana");
		centroVotacion4.setMunicipio(sanMarcos);
		centroVotacionRepository.save(centroVotacion4);

		CentroVotacion centroVotacion5 = new CentroVotacion();
		centroVotacion5.setNombre("Parque San Salvador");
		centroVotacion5.setMunicipio(sanMarcos);
		centroVotacionRepository.save(centroVotacion5);

	}

	private void saveJrv() {

		CentroVotacion parqueSanSalvador = centroVotacionRepository.getReferenceById(5);

		JRV jrv1 = new JRV();
		jrv1.setNombre("123");
		jrv1.setCentroVotacion(parqueSanSalvador);
		jrvRepository.save(jrv1);

		JRV jrv2 = new JRV();
		jrv2.setNombre("124");
		jrv2.setCentroVotacion(parqueSanSalvador);
		jrvRepository.save(jrv2);

		JRV jrv3 = new JRV();
		jrv3.setNombre("125");
		jrv3.setCentroVotacion(parqueSanSalvador);
		jrvRepository.save(jrv3);

		JRV jrv4 = new JRV();
		jrv4.setNombre("126");
		jrv4.setCentroVotacion(parqueSanSalvador);
		jrvRepository.save(jrv4);

		JRV jrv5 = new JRV();
		jrv5.setNombre("127");
		jrv5.setCentroVotacion(parqueSanSalvador);
		jrvRepository.save(jrv5);

	}

	private void savePadron() {

		Padron padron1 = new Padron();
		padron1.setCorrelativoPadron(5346476);
		padronRepository.save(padron1);

		Padron padron2 = new Padron();
		padron2.setCorrelativoPadron(7567455);
		padronRepository.save(padron2);

		Padron padron3 = new Padron();
		padron3.setCorrelativoPadron(8923488);
		padronRepository.save(padron3);

		Padron padron4 = new Padron();
		padron4.setCorrelativoPadron(2012943);
		padronRepository.save(padron4);

		Padron padron5 = new Padron();
		padron5.setCorrelativoPadron(5454958);
		padronRepository.save(padron5);
	}

	private void savePartido(){
		Partido partido1 = new Partido();
		partido1.setBandera("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Bandera_Nuevas_Ideas.svg/1200px-Bandera_Nuevas_Ideas.svg.png");
		partido1.setNombre("Nuevas Ideas");
		partidoRepository.save(partido1);

		Partido partido2 = new Partido();
		partido2.setBandera("https://upload.wikimedia.org/wikipedia/commons/thumb/3/39/Alianza_Republicana_Nacionalista.svg/1200px-Alianza_Republicana_Nacionalista.svg.png");
		partido2.setNombre("Alianza Republicana Nacionalista");
		partidoRepository.save(partido2);

		Partido partido3 = new Partido();
		partido3.setBandera("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/Bandera_de_GANA.svg/1200px-Bandera_de_GANA.svg.png");
		partido3.setNombre("Gran Alianza por la Unidad Nacional");
		partidoRepository.save(partido3);
		

		Partido partido4 = new Partido();
		partido4.setBandera("https://upload.wikimedia.org/wikipedia/commons/b/ba/Bandera_-_Frente_Farabundo_Mart%C3%AD_para_la_Liberaci%C3%B3n_Nacional.svg");
		partido4.setNombre("Frente Farabundo Martí para la Liberación Nacional");
		partidoRepository.save(partido4);

		Partido partido5 = new Partido();
		partido5.setBandera("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Flag_PCN.svg/800px-Flag_PCN.svg.png");
		partido5.setNombre("Partido de Concertación Nacional");
		partidoRepository.save(partido5);
	}

	private void saveCandidato() {
		Partido nuevasIdeas = partidoRepository.getReferenceById(1);
		Candidato candidato1 = new Candidato();
		candidato1.setNombre("Xavi Zablah");
		candidato1.setApellido("Bukele");
		candidato1.setPartido(nuevasIdeas);
		candidatoRepository.save(candidato1);

		Partido arena = partidoRepository.getReferenceById(2);
		Candidato candidato2 = new Candidato();
		candidato2.setNombre("Erick");
		candidato2.setApellido("Salguero");
		candidato2.setPartido(arena);
		candidatoRepository.save(candidato2);

		Partido gana = partidoRepository.getReferenceById(3);
		Candidato candidato3 = new Candidato();
		candidato3.setNombre("Nelson");
		candidato3.setApellido("Guardado");
		candidato3.setPartido(gana);
		candidatoRepository.save(candidato3);

		Partido fmln = partidoRepository.getReferenceById(4);
		Candidato candidato4 = new Candidato();
		candidato4.setNombre("Oscar");
		candidato4.setApellido("Ortiz");
		candidato4.setPartido(fmln);
		candidatoRepository.save(candidato4);

		Partido pcn = partidoRepository.getReferenceById(5);
		Candidato candidato5 = new Candidato();
		candidato5.setNombre("Manuel");
		candidato5.setApellido("Rodriguez");
		candidato5.setPartido(pcn);
		candidatoRepository.save(candidato5);
	}

	private void saveTipoCandidato() {
		Candidato candidatoN = candidatoRepository.getReferenceById(1);
		TipoCandidato tipoCandidato1 = new TipoCandidato();
		tipoCandidato1.setNombreTipoCandidato("presidente");
		tipoCandidato1.setCandidato(candidatoN);
		tipoCandidatoRepository.save(tipoCandidato1);

		Candidato candidatoArena = candidatoRepository.getReferenceById(2);
		TipoCandidato tipoCandidato2 = new TipoCandidato();
		tipoCandidato2.setNombreTipoCandidato("presidente");
		tipoCandidato2.setCandidato(candidatoArena);
		tipoCandidatoRepository.save(tipoCandidato2);

		Candidato candidatoGana = candidatoRepository.getReferenceById(3);
		TipoCandidato tipoCandidato3 = new TipoCandidato();
		tipoCandidato3.setNombreTipoCandidato("presidente");
		tipoCandidato3.setCandidato(candidatoGana);
		tipoCandidatoRepository.save(tipoCandidato3);

		Candidato candidatoFmln = candidatoRepository.getReferenceById(4);
		TipoCandidato tipoCandidato4 = new TipoCandidato();
		tipoCandidato4.setNombreTipoCandidato("presidente");
		tipoCandidato4.setCandidato(candidatoFmln);
		tipoCandidatoRepository.save(tipoCandidato4);

		Candidato candidatoPcn = candidatoRepository.getReferenceById(5);
		TipoCandidato tipoCandidato5 = new TipoCandidato();
		tipoCandidato5.setNombreTipoCandidato("presidente");
		tipoCandidato5.setCandidato(candidatoPcn);
		tipoCandidatoRepository.save(tipoCandidato5);
	}

	private void savePapeleta() {
		JRV jrv1 = jrvRepository.getReferenceById(1);
		Padron padron1 = padronRepository.getReferenceById(1);
		Papeleta papeleta1 = new Papeleta();
		papeleta1.setJrv(jrv1);
		papeleta1.setPadron(padron1);
		papeletaRepository.save(papeleta1);

		JRV jrv2 = jrvRepository.getReferenceById(2);
		Padron padron2 = padronRepository.getReferenceById(2);
		Papeleta papeleta2 = new Papeleta();
		papeleta2.setJrv(jrv2);
		papeleta2.setPadron(padron2);
		papeletaRepository.save(papeleta2);

		JRV jrv3 = jrvRepository.getReferenceById(3);
		Padron padron3 = padronRepository.getReferenceById(3);
		Papeleta papeleta3 = new Papeleta();
		papeleta3.setJrv(jrv3);
		papeleta3.setPadron(padron3);
		papeletaRepository.save(papeleta3);

		JRV jrv4 = jrvRepository.getReferenceById(4);
		Padron padron4 = padronRepository.getReferenceById(4);
		Papeleta papeleta4 = new Papeleta();
		papeleta4.setJrv(jrv4);
		papeleta4.setPadron(padron4);
		papeletaRepository.save(papeleta4);

		JRV jrv5 = jrvRepository.getReferenceById(5);
		Padron padron5 = padronRepository.getReferenceById(5);
		Papeleta papeleta5 = new Papeleta();
		papeleta5.setJrv(jrv5);
		papeleta5.setPadron(padron5);
		papeletaRepository.save(papeleta5);
	}

	private void saveUsuarioPapeleta() {
		Papeleta papeleta1 = papeletaRepository.getReferenceById(1);
		Usuario usuario1 = usuarioRepository.findByDui("ER100420");
		usuario1.setPapeleta(papeleta1);
		usuarioRepository.save(usuario1);

		Papeleta papeleta2 = papeletaRepository.getReferenceById(2);
		Usuario usuario2 = usuarioRepository.findByDui("RA102011");
		usuario2.setPapeleta(papeleta2);
		usuarioRepository.save(usuario2);

		Papeleta papeleta3 = papeletaRepository.getReferenceById(3);
		Usuario usuario3 = usuarioRepository.findByDui("BC100520");
		usuario3.setPapeleta(papeleta3);
		usuarioRepository.save(usuario3);

		Papeleta papeleta4 = papeletaRepository.getReferenceById(4);
		Usuario usuario4 = usuarioRepository.findByDui("MM102120");
		usuario4.setPapeleta(papeleta4);
		usuarioRepository.save(usuario4);

		Papeleta papeleta5 = papeletaRepository.getReferenceById(5);
		Usuario usuario5 = usuarioRepository.findByDui("FG100220");
		usuario5.setPapeleta(papeleta5);
		usuarioRepository.save(usuario5);
	}

	private void saveUsuarios() {
		List<Usuario> usuarios = new LinkedList<Usuario>();

		Usuario usuario1 = new Usuario();
		usuario1.setDUI("ER100420");
		usuario1.setNombre("Pedro Antonio");
		usuario1.setApellido("Elias Recinos");
		usuario1.setContrasena("$2a$10$B5B4qCPBYhV.4m5Oqev8bOmGrMkfPxJoR3CK8vNMQbc68o9jUSUES");
		usuarios.add(usuario1);

		Usuario usuario2 = new Usuario();
		usuario2.setDUI("RA102011");
		usuario2.setNombre("Gerson Vladimir");
		usuario2.setApellido("Ramos Argueta");
		usuario2.setContrasena("$2a$10$B5B4qCPBYhV.4m5Oqev8bOmGrMkfPxJoR3CK8vNMQbc68o9jUSUES");

		usuarios.add(usuario2);

		Usuario usuario3 = new Usuario();
		usuario3.setDUI("BC100520");
		usuario3.setNombre("Ernesto Jose");
		usuario3.setApellido("Barrientos Cedillos");
		usuario3.setContrasena("$2a$10$B5B4qCPBYhV.4m5Oqev8bOmGrMkfPxJoR3CK8vNMQbc68o9jUSUES");

		usuarios.add(usuario3);

		Usuario usuario4 = new Usuario();
		usuario4.setDUI("MM102120");
		usuario4.setNombre("Andres Alexander");
		usuario4.setApellido("Melendez Martinez");
		usuario4.setContrasena("$2a$10$B5B4qCPBYhV.4m5Oqev8bOmGrMkfPxJoR3CK8vNMQbc68o9jUSUES");

		usuarios.add(usuario4);

		Usuario usuario5 = new Usuario();
		usuario5.setDUI("FG100220");
		usuario5.setNombre("Miguel Angel");
		usuario5.setApellido("Flores Guzman");
		usuario5.setContrasena("$2a$10$B5B4qCPBYhV.4m5Oqev8bOmGrMkfPxJoR3CK8vNMQbc68o9jUSUES");

		usuarios.add(usuario5);

		usuarioRepository.saveAll(usuarios);

		System.out.println(usuarios.size() + " Usuarios se añadieron!");
	}

	private void deletePapeletas() {
		papeletaRepository.deleteAll();
	}

	private void deleteVotos() {
		votoRepository.deleteAll();
	}

	private void deleteUsuarios() {
		usuarioRepository.deleteAll();
	}
}
