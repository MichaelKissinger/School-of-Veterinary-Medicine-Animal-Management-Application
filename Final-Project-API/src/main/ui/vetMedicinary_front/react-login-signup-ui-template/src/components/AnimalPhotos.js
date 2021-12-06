import React from "react";
import "bulma/css/bulma.css"

const AnimalPhoto = () => {
  
    // const[count, setCount] = useState(0);
    return(
        <div class = "columns"> 
        <div class="column">
        <figure class="image is-128x128">
            <img src="https://static01.nyt.com/images/2021/09/14/science/07CAT-STRIPES/07CAT-STRIPES-mediumSquareAt3X-v2.jpg"/>
        </figure>
        </div>
        <div class="column">
        <figure class="image is-128x128">
            <img src="https://images.livemint.com/img/2021/09/08/689x388/erik-jan-leusink-IbPxGLgJiMI-unsplash_1631079336162_1631079359671.jpg"/>
        </figure>
        
        </div>
        <div class="column is-narrow">
          <button class="button is-dark">Add new Animal Picture</button>  
        </div>
        </div>
       

    );
};

export default AnimalPhoto;