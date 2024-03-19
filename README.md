# Property-Management-System-using-Java-Swing-and-MySql

## Features

## Seller
1. Sign up with details such as name, contact number, email, address, and password.
2. Login with contact number and password.
3. Add properties including plots, flats, and rental properties with various attributes.
4. View and update their details.
5. View previously registered properties.

Sign Up:
Sellers can sign up providing their name, contact number, email, address, and password. This data is stored in the seller table in the database.

Login:
Sellers can log in using their contact number and password. The system verifies the credentials against the database.

Property Management:

After successful login, sellers have the following options:

Add Plot: Add details of a plot including location, area, price, type, and floor allowed. Data is stored in the plot table.
Add Flat: Add details of a flat including location, area, price, type, furnished status, and amenities. Data is stored in the flat table.
Add Rent: Add details of a rental property including location, availability date, price, duration, locality, and amenities. Data is stored in the rent table.

View and Update Details:
Sellers can view their details and update them as necessary.

View Registered Properties:
Sellers can see a list of properties they have already registered.

## Buyer
1. View available plots, flats, and rental properties.
2. Filter properties based on different criteria like area, price, type, etc.

Property Viewing:
Buyers can view available plots, flats, and rental properties.

Plot Filtering:
Buyers can filter plots based on criteria such as area, floor allowed, and price using MySQL queries.

Flat Filtering:
Buyers can filter flats based on criteria such as type, furnished status, and price using MySQL queries.

Rent Filtering:
Buyers can filter rental properties based on criteria such as duration, locality, type, and price using MySQL queries.

