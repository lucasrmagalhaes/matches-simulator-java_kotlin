package me.dio.simulator.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import me.dio.simulator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();
    }

    private void setupMatchesList() {
        // TODO Listas as partidas, consumindo nossa API.
    }

    private void setupMatchesRefresh() {
        // TODO Atualizar as partidas na ação de swipe.
    }

    private void setupFloatingActionButton() {
        // TODO Criar evento de click e simulação de partidas.
    }
}