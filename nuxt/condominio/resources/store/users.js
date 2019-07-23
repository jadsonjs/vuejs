


export const state = () => ({
    users: []
})
  
export const mutations = {
    add (state, name) {
        state.users.push({
            name: name,
            active: true
        })
    },
    remove (state, { user }) {
        state.users.splice(state.users.indexOf(user), 1)
    },
    toggle (state, user) {
        user.active = !user.active
    }
}

