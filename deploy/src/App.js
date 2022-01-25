import "./App.css";
import ListEmployees from "./components/ListEmployees";
import Header from "./components/Header";
import Footer from "./components/Footer";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import AddEmployee from "./components/AddEmployee";
import Map from "./components/Map";
import Chat from "./components/Chat";

function App() {
  return (
    <div>
      <Header />
      <div className="container">
        <BrowserRouter>
          <Routes>
            <Route path="/" exact element={<ListEmployees />} />
            <Route path="/employees" element={<ListEmployees />} />
            <Route path="/add" element={<AddEmployee />} />
            <Route path="/map" element={<Map />}></Route>
            <Route path="/chat" element={<Chat />}></Route>
          </Routes>
        </BrowserRouter>
        ,
      </div>
      <Footer />
    </div>
  );
}

export default App;
