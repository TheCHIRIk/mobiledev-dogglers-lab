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
            R.drawable.tzeitel,
            "Tzeitel",
            "7",
            "sunbathing"
        ),
        Car(
            R.drawable.leroy,
            "Leroy",
            "4",
            "sleeping in dangerous places"
        ),
        Car(
            R.drawable.frankie,
            "Frankie",
            "2",
            "stealing socks"
        ),
        Car(
            R.drawable.nox,
            "Nox",
            "8",
            "meeting new animals"
        ),
        Car(
            R.drawable.faye,
            "Faye",
            "8",
            "Digging in the garden"
        ),
        Car(
            R.drawable.bella,
            "Bella",
            "14",
            "Chasing sea foam"
        )
    )
}
