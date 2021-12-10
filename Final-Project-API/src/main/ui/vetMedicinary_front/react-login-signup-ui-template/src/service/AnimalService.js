import axios from 'axios'
import React, {useState} from 'react';

const ANIMAL_REST_API_URL = 'http://localhost:8080/search/animal';

class AnimalService {

    getAnimals() {
        return axios.get(ANIMAL_REST_API_URL);
    }

    getAnimalProblems(animalId) {
        return axios.get(ANIMAL_REST_API_URL + '/problems/' + animalId);
    }

    getAnimalPrescriptions(animalId) {
        return axios.get(ANIMAL_REST_API_URL + '/prescriptions/' + animalId);
    }

    getAnimalHistory(animalId) {
        return axios.get(ANIMAL_REST_API_URL + '/history/' + animalId);
    }

}

export default new AnimalService();