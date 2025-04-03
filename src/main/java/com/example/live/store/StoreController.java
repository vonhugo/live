package com.example.live.store;

import java.util.List;

import com.example.live.store.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@RestController
@RequestMapping("/api/stores")
public class StoreController {

    private static final Logger logger = LoggerFactory.getLogger(com.example.live.store.StoreController.class);

    @Autowired
    private StoreRepository storeRepository;

    @GetMapping
    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Store getStoreById(@PathVariable Long id) {
        return storeRepository.findById(id).get();
    }

    @PostMapping
    public Store createStore(@RequestBody Store store) {
        return storeRepository.save(store);
    }

    @PutMapping("/{id}")
    public Store updateUser(@PathVariable Long id, @RequestBody Store store) {
        Store existingStore = storeRepository.findById(id).get();

        logger.info("Updating store with ID: {}", id);
        //logger.info("New username: {}", user.getUsername());
        //logger.info("New role: {}", user.getRole());

        existingStore.setName(store.getName());
        //existingStore.setEmail(store.getEmail());
        //existingStore.setUsername(store.getUsername());
        //existingStore.setRole(store.getRole());
        return storeRepository.save(existingStore);
    }

    @DeleteMapping("/{id}")
    public String deleteStore(@PathVariable Long id) {
        try {
            storeRepository.findById(id).get();
            storeRepository.deleteById(id);
            return "Store deleted successfully";
        } catch (Exception e) {
            return "Store not found";
        }
    }
}