package com.example.broker.store;

import com.example.broker.model.Symbol;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Singleton
public class InMemoryStore {
    private final List<Symbol> symbols;

    public InMemoryStore() {
        symbols = Stream.of("AAPL" , "AMZN" , "FB" , "GOOG" , "MSFT" , "NFLX" , "TSLA").map(Symbol::new).collect(Collectors.toList());
    }

    public List<Symbol> getAllSymbols(){
        return symbols;
    }
}
