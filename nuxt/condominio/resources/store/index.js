
// export as a function
export const state = () => ({
    counter: 0
})
  
// export as a object
export const mutations = {
    increment (state) {
        state.counter++
    }
}

