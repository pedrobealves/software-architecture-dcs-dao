package br.edu.utfpr.exception;

public class DuplicatedClientException extends Exception{
    public DuplicatedClientException(String description){
        super(description);
    }
}
