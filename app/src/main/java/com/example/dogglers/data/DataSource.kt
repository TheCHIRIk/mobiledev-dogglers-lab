/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.data

import com.example.dogglers.R
import com.example.dogglers.model.Car

/**
 * An object to generate a static list of cars
 */
object DataSource {

    val cars: List<Car> = listOf(
        Car(
            R.drawable.altima,
            "Nissan",
            "2020",
            "Altima"
        ),
        Car(
            R.drawable.tundra,
            "Toyota",
            "2019",
            "Tundra"
        ),
        Car(
            R.drawable.silverado,
            "Chevrolet",
            "2015",
            "Silverado"
        ),
        Car(
            R.drawable.camry,
            "Toyota",
            "2018",
            "Camry"
        ),
        Car(
            R.drawable.accord,
            "Honda",
            "2016",
            "Accord"
        ),
        Car(
            R.drawable.f150,
            "Ford",
            "2017",
            "F-150"
        )
    )
}
