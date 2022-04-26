package com.domain.driver.design.escola.infra.indicacao;

import com.domain.driver.design.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import com.domain.driver.design.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de email com a lib Java Mail
	}
}
