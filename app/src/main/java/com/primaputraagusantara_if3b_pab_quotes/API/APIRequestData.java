package com.primaputraagusantara_if3b_pab_quotes.API;

import com.primaputraagusantara_if3b_pab_quotes.Model.QuotesModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData
{
    @GET("quotes")
    Call<List<QuotesModel>> requestData();
}
