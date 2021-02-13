package br.com.tinnova.testepratico.controller.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.tinnova.testepratico.controller.ExercicioCincoController;
import br.com.tinnova.testepratico.dto.ResponseDto;
import br.com.tinnova.testepratico.entity.Veiculo;
import br.com.tinnova.testepratico.service.ExercicioCincoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="Endpoint exercicio 5", tags= {"ExercicioCinco"})
@RestController
@RequestMapping("/v1/api/ex5")
public class ExercicioCincoControllerImpl implements ExercicioCincoController{
	
	private final ExercicioCincoService exercicioCincoService;

	public ExercicioCincoControllerImpl(ExercicioCincoService exercicioCincoService) {
		this.exercicioCincoService = exercicioCincoService;
	}

	@Override
	@GetMapping(value = "/veiculos")
	@ApiOperation(value="Endpoint para busca de todos os veiculos da base de dados")
	@ResponseBody
	public ResponseEntity<ResponseDto> buscarTodosVeiculos() {
		return ResponseEntity.ok(new ResponseDto(exercicioCincoService.buscarTodosVeiculos(), HttpStatus.OK.toString()));
	}

	@Override
	@GetMapping(value = "/veiculos/find/{nomeParaBusca}")
	@ApiOperation(value="Endpoint para busca de veículo por nome")
	@ResponseBody
	public ResponseEntity<ResponseDto> buscarVeiculoPorNome(@PathVariable("nomeParaBusca") String nomeParaBusca) {
		return ResponseEntity.ok(new ResponseDto(exercicioCincoService.buscarVeiculoPorNome(nomeParaBusca), HttpStatus.OK.toString()));
	}

	@Override
	@GetMapping(value = "/veiculos/{idVeiculo}")
	@ApiOperation(value="Endpoint para busca de veículo por Id")
	@ResponseBody
	public ResponseEntity<ResponseDto> buscarVeiculoPorId(@PathVariable("idVeiculo") Long idVeiculo) {
		return ResponseEntity.ok(new ResponseDto(exercicioCincoService.buscarVeiculoPorId(idVeiculo), HttpStatus.OK.toString()));
	}

	@Override
	@PostMapping(value = "/veiculos")
	@ApiOperation(value="Endpoint para criação de novo veículo")
	@ResponseBody
	public ResponseEntity<ResponseDto> criarVeiculo(@RequestBody Veiculo veiculo) {
		return ResponseEntity.ok(new ResponseDto(exercicioCincoService.criarVeiculo(veiculo), HttpStatus.OK.toString()));
	}

	@Override
	@PutMapping(value = "/veiculos")
	@ApiOperation(value="Endpoint para atualização de veículo")
	@ResponseBody
	public ResponseEntity<ResponseDto> atualizarVeiculo(@RequestBody Veiculo veiculo) {
		return ResponseEntity.ok(new ResponseDto(exercicioCincoService.atualizarVeiculo(veiculo), HttpStatus.OK.toString()));
	}

	@Override
	@PatchMapping(value = "/veiculos/{idVeiculo}")
	@ApiOperation(value="Endpoint para atualização de veículo para vendido")
	@ResponseBody
	public ResponseEntity<ResponseDto> atualizarVeiculoParaVendido(@PathVariable("idVeiculo") Long idVeiculo) {
		return ResponseEntity.ok(new ResponseDto(exercicioCincoService.atualizarVeiculoParaVendido(idVeiculo), HttpStatus.OK.toString()));
	}

	@Override
	@DeleteMapping(value = "/veiculos")
	@ApiOperation(value="Endpoint para atualização de veículo para vendido")
	@ResponseBody
	public ResponseEntity<ResponseDto> apagarVeiculo(Long idVeiculo) {
		return ResponseEntity.ok(new ResponseDto(exercicioCincoService.apagarVeiculo(idVeiculo), HttpStatus.OK.toString()));
	}
	
}
