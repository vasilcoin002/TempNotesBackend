package org.example.tempnotes.DTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
// TODO refactor it and DeleteUserNotesRequest to the one class ChangeUserNotesRequest
public class UpdateUserNotesOrderRequest {
    private List<String> newNotesIdList;
}
