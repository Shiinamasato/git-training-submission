const stripe = Stripe('API公開キーを入力');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
	
	stripe.redirectToCheckout({
		sessionId: sessionId
	})
});
