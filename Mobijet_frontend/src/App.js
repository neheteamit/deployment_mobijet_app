//import logo from './logo.svg';
import "./App.css";
//import Header from './components/Header';
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Login from "./components/InternalComponents/Login";
import SearchProduct from "./components/InternalComponents/SearchProduct";
import SPRegistration from "./components/InternalComponents/SPRegistration";
import ServiceproviderHome from "./components/InternalComponents/ServiceProviderHome";
import CustomerHome from "./components/InternalComponents/CustomerHome";
import Home from "./components/InternalComponents/Home";
import UploadProduct from "./components/InternalComponents/UploadProduct";
import SearchService from "./components/InternalComponents/SearchService";
import CustomerRegistration from "./components/InternalComponents/CustomerRegistration";
import Order from "./components/InternalComponents/Order";
import ViewRequest from "./components/InternalComponents/ViewRequest";
import Solution from "./components/InternalComponents/Solution";
import Validation from "./components/InternalComponents/Validation";
import Call from "./components/InternalComponents/Help";
import Getallusers from "./components/InternalComponents/Getallusers";
import SearchProducts from "./components/InternalComponents/withoutloginproducts";
import Aboutus from "./components/InternalComponents/Aboutus";
import Help from "./components/InternalComponents/Help";
import Rating from "./components/InternalComponents/Rating";
//import Protected from './components/Protected'
//import { Button } from 'react-bootstrap';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/home" element={<Home />} />
          <Route path="/login" element={<Login />} />
          <Route path="/searchproduct" element={<SearchProduct />} />
          <Route path="/uploadproduct" element={<UploadProduct />} />
          <Route path="/spregister" element={<SPRegistration />} />
          <Route path="/custhome" element={<CustomerHome />} />
          <Route path="/servicehome" element={<ServiceproviderHome />} />
          <Route path="/searchservice" element={<SearchService />} />
          <Route path="/viewrequest" element={<ViewRequest />} />
          <Route path="/custregister" element={<CustomerRegistration />} />
          <Route path="/buyproduct" element={<Order />} />
          <Route path="/setsolution" element={<Solution />} />
          <Route path="/validate" element={<Validation />} />
          <Route path="/wlginprdcts" element={<SearchProducts />} />
          <Route path="/help" element={<Call />} />
          <Route path="/getallusers" element={<Getallusers />} />
          <Route path="/aboutus" element={<Aboutus />} />
          <Route path="/help" element={<Help />} />
          <Route path="/rating" element={<Rating />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
