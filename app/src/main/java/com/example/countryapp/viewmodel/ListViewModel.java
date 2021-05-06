package com.example.countryapp.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.countryapp.model.CountryModel;

import java.util.ArrayList;
import java.util.List;

public class ListViewModel extends ViewModel {

    public MutableLiveData<List<CountryModel>> countries = new MutableLiveData<List<CountryModel>>();
    public MutableLiveData<Boolean> countryLoadError = new MutableLiveData<Boolean>();
    public MutableLiveData<Boolean> loading = new MutableLiveData<Boolean>();

    public void refresh() {
        fetchCountries();
    }

    private void fetchCountries() {
        CountryModel country1 = new CountryModel("Albania", "Tirana", "");
        CountryModel country2 = new CountryModel("Brazil", "Brasilia", "");
        CountryModel country3 = new CountryModel("Czechia", "Praha", "");

        List<CountryModel> list = new ArrayList<>();
        list.add(country1);
        list.add(country2);
        list.add(country3);
        list.add(country1);
        list.add(country2);
        list.add(country3);
        list.add(country1);
        list.add(country2);
        list.add(country3);

        countries.setValue(list);
        countryLoadError.setValue(false);
        loading.setValue(false);
    }

}
