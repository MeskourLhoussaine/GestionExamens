
import './App.css';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Footer from './components/Footer';
import Header from './components/Header';

function App() {
  return (

    <div className="App">
        <Router>
        <Header/>
        
        <Footer/>
        </Router>
    </div>

);
}

export default App;
