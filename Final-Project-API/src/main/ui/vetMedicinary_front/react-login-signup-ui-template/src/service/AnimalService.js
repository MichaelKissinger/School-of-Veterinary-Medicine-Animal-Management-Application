import axios from 'axios'
import React, {useState} from 'react';

const ANIMAL_REST_API_URL = 'http://localhost:8080/search/animal';

class AnimalService {

    getAnimals() {
        return axios.get(ANIMAL_REST_API_URL);
    }

}

export default new AnimalService();