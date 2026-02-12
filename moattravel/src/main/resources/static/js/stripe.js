const stripe = Stripe('pk_test_51Szh9OPpdDmU0S7uUrzY5Qe424uI8xRdJkSHo6pBDXTgYcJjLRmUiV3SWQ28L6PpenzKGAzolYaZCl8ANYVsBOIb00UvfSbHyi');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
	
	stripe.redirectToCheckout({
		sessionId: sessionId
	})
});
