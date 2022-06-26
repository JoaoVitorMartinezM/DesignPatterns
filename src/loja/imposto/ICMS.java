package loja.imposto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS extends Imposto{
    public ICMS(Imposto outro) {
        super(outro);
    }

    @Override
    public BigDecimal impostoaSerAplicado(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
