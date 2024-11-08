package com.AluraONE.ConvertidorMoneda.model;

public record MonedaRecord(String base_code,
                           String target_code,
                           double conversion_rate
) {

}