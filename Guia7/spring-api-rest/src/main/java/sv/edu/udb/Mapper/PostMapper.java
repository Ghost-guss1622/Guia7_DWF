package sv.edu.udb.Mapper;

import org.mapstruct.Mapper;
import sv.edu.udb.domain.Post;
import sv.edu.udb.request.PostRequest;
import sv.edu.udb.response.PostResponse;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PostMapper {
    PostResponse toPostResponse(final Post data);
    List<PostResponse> toPostResponseList(final List<Post> postList);
    Post toPost(final PostRequest postRequest);
}