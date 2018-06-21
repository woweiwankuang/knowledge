package com.mytest.demo.mapstruct;

import org.junit.Test;


public class test {

    @Test
    public void testMapStruct(){
        Car car = new Car("Morris", 5, Car.CarType.AODI);

        CarDto carDto = CarMapper.INSTANCE.carToCarDto( car );

        System.out.print(carDto.toString());
    }
}
