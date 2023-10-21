/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        //optimised approach
        //fast and slow method
        if(head==NULL || head->next==NULL){
            return head;
        }

        if(head->next->next==NULL){
            return head->next;
        }

        ListNode* slow= head;
        ListNode* fast= head->next;

        while(fast != NULL){
            fast=fast->next;
            if(fast != NULL){
                fast=fast->next;
            }

            slow=slow->next;


        }

        return slow;


        /*
        //normal approach
    
        ListNode* temp = head;
        int count=0;

        while(temp != NULL){
            temp=temp->next;
            count++;
        }

        int mid=count/2;
        int cnt=0;
        ListNode* temp2 = head;
        while(cnt != mid){
            temp2=temp2->next;
            cnt++;
        }

        return temp2;


        
        */
    }
};