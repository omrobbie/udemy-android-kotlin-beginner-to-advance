package com.omrobbie.variables

/**
 * Created by omrobbie on 27/01/2018.
 */

class DataModel {
    var arrayList = ArrayList<Vehicle>()

    fun addVehicle(name: String, model: Int, price: String, company: Company) {
        var vehicle = Vehicle(name, model, price, company)
        arrayList.add(vehicle)
        println("Vehicle added successfully")
    }

    fun sellVehicle(position: Int) {
        arrayList.removeAt(position)
        println("Vehicle sell successfully")
    }

    fun showAll() {
        for (item in arrayList) {
            println("Name = " + item.name)
            println("Price = " + item.price)
            println("Model = " + item.model)
            println("Company = " + item.company)
        }
    }
}