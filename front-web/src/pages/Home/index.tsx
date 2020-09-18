import React from 'react';
import { ReactComponent as ArrowIcon } from '../../assets/arrow.svg';
import { ReactComponent as GamerImagen } from '../../assets/gamer.svg';
import {Link} from 'react-router-dom';
import './styles.css';

const Home = () => (
    <div className="home-container">
      <div className="home-text">
          <h1 className="home-text-title">
            Quais Jogos a galera gosta mais?          
          </h1> 
          <h3 className="home-text-subtitle">
            Clique no botão abaixo e saiba quais são os jogos que os gamer estão escolhendo! 
          </h3> 
          <Link to="/records">
         <div className="home-actions">
             <button className="home-btn">
             QUERO SABER QUAIS SÃO
             </button>
             <div className="home-btn-icon">
                <ArrowIcon/>
             </div>
         </div> 
         </Link>  
      </div>
      <GamerImagen className="home-image"/>
    </div>


);

export default Home;