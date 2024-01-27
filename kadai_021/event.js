const h2Text = document.getElementById('text');

const PushBtn = document.getElementById('btn');

PushBtn.addEventListener('click',() => {
  setTimeout(() => {
    h2Text.textContent = 'ボタンをクリックしました';
  }, 2000);
})