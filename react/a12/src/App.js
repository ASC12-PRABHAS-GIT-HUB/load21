export default function GithubUser() {
  const user = {
    login: "ASC12-PRABHAS-GIT-HUB",
    avatar_url: "https://avatars.githubusercontent.com/u/220701839?v=4",
    public_repos: 2,
    followers: 0,
    created_at: "2025-07-14T09:23:29Z",
    updated_at: "2025-08-21T10:26:46Z",
  };

  return (
    <div>
      <h1>GitHub User: {user.login}</h1>
      <img src={user.avatar_url} alt="avatar" width="150" />
      <p>Public Repos: {user.public_repos}</p>
      <p>Followers: {user.followers}</p>
      <p>Created At: {user.created_at}</p>
      <p>Last Updated: {user.updated_at}</p>
    </div>
  );
}
