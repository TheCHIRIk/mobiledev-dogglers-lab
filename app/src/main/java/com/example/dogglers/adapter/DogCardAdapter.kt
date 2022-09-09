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
package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.const.Layout
import com.example.dogglers.model.Car
import com.example.dogglers.data.DataSource

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class CarCardAdapter(
    private val context: Context?,
    private val layout: Int
): RecyclerView.Adapter<CarCardAdapter.CarCardViewHolder>() {

    val cars: List<Car> = DataSource.cars

        /**
     * Initialize view elements
     */
    class CarCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        // TODO: Declare and initialize all of the list item UI components
        @DrawableRes var carImage: ImageView = view!!.findViewById(R.id.car_image)
        var carMake: TextView = view!!.findViewById(R.id.car_make)
        var carYearReleased: TextView = view!!.findViewById(R.id.car_year)
        var carModel: TextView = view!!.findViewById(R.id.car_model)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarCardViewHolder {
        // TODO: Use a conditional to determine the layout type and set it accordingly.
        //  if the layout variable is Layout.GRID the grid list item should be used. Otherwise the
        //  the vertical/horizontal list item should be used.
        return when (layout){
            Layout.GRID -> CarCardViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item, parent, false))
            Layout.VERTICAL, Layout.HORIZONTAL -> CarCardViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_list_item, parent, false))
            else -> throw IllegalArgumentException("Unsupported view type $layout")
        }
        // TODO Inflate the layout

        // TODO: Null should not be passed into the view holder. This should be updated to reflect
        //  the inflated layout.
    }

    override fun getItemCount(): Int = cars.size

    override fun onBindViewHolder(holder: CarCardViewHolder, position: Int) {
        val car: Car = cars[position]
        holder.carMake.text = car.make
        holder.carImage.setImageResource(car.imageResourceId)
        holder.carYearReleased.text = car.yearReleased
        holder.carModel.text = car.model
        val resources = context?.resources
        resources?.getString(R.string.car_yearReleased, car.yearReleased)
        resources?.getString(R.string.car_model, car.model)
    }
}
