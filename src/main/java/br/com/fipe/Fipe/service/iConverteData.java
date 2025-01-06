package br.com.fipe.Fipe.service;

public interface iConverteData {
	<T> T obterDados (String json, Class<T> classe);
}
