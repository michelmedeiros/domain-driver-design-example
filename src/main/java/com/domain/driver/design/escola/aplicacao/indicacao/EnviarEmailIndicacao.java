package com.domain.driver.design.escola.aplicacao.indicacao;


import com.domain.driver.design.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}
