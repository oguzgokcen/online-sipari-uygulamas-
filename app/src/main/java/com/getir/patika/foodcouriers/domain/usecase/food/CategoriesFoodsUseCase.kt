package com.getir.patika.foodcouriers.domain.usecase.food

import com.getir.patika.foodcouriers.common.domain.SingleParaMeterUseCase
import com.getir.patika.foodcouriers.domain.model.BaseResponse
import com.getir.patika.foodcouriers.domain.model.Food.Food
import com.getir.patika.foodcouriers.domain.repository.FoodRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CategoriesFoodsUseCase @Inject constructor(
    private val foodRepository: FoodRepository
): SingleParaMeterUseCase<String, Flow<BaseResponse<List<Food>>>> {

    override fun execute(param: String): Flow<BaseResponse<List<Food>>>  = foodRepository.getCategoriesFoods(param)

}