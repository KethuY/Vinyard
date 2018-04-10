package com.prts.vinyard.restapi;

import com.prts.vinyard.models.RootObject;

import retrofit2.Call;
import retrofit2.http.GET;

import static com.prts.vinyard.restapi.RestConstants.GET_MENU_ITEMS;

public interface RestService {
    @GET(GET_MENU_ITEMS)
    Call<RootObject> getMenuItems();
}
