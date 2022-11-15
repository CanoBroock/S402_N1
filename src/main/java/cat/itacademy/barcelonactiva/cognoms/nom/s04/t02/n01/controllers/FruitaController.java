package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.controllers;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.repository.FruitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fruita")
public class FruitaController {

    @Autowired
    private FruitaRepository fruitaRepository;

    @PostMapping("/add")
    public ResponseEntity<Fruita> addFruta(@RequestBody Fruita fruita) {

        fruitaRepository.save(fruita);
        return new ResponseEntity<Fruita>(fruita, HttpStatus.CREATED);

    }

    @PutMapping("/update")
    public ResponseEntity<Fruita> updateFruita(@PathVariable("id") long id, @RequestBody Fruita fruita) {
        boolean fruitaSearch = fruitaRepository.existsById((int) id);

        if (fruitaSearch) {
            return new ResponseEntity<Fruita>(fruitaRepository.save(fruita), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
//
//	@DeleteMapping("/delete/{id}")
//	public ResponseEntity<HttpStatus> deleteFruita() {
//
//		fruitaRepository.deleteAll();
//		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//
//	}
//
////	@GetMapping("/getOne/{id}")
////	public ResponseEntity<List<Fruita>> findByPublished() {
////
////		List<Fruita> fruitas = fruitaRepository.fruitaSearch(true);
////
////		if (fruitas.isEmpty()) {
////			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
////		}
////		return new ResponseEntity<>(fruitas, HttpStatus.OK);
////
////	}
//
//	@GetMapping("/getAll")
//	public ResponseEntity<List<Fruita>> getAllTutorials(@RequestParam(required = false) String title) {
//
//		List<Fruita> fruitas = new ArrayList<Fruita>();
//
//		if (fruitas.isEmpty())
//			fruitaRepository.findAll().forEach(fruitas::add);
//
//		if (fruitas.isEmpty()) {
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		} else {
//			return new ResponseEntity<>(fruitas, HttpStatus.OK);
//		}
//
//	}
//
}

