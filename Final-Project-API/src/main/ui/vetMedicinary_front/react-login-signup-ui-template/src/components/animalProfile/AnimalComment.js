import React from "react";
import "bulma/css/bulma.css"

const AnimalComments = () => {
  
    // const[count, setCount] = useState(0);
    return(
        <div class = "columns"> 
        <div class="column">
            <textarea class="textarea" placeholder="Enter Comment"></textarea>
        </div>
        <div class="column">
          <button class="button is-dark">Add Comment</button>  
        </div>
        </div>
    );
};

export default AnimalComments;