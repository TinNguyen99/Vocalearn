package com.example.voctn;


public class Word {
    public String[] EngWord = {
            "Abide by", "Agreement", "Agree", "Assurance", "Cancellation", "Determine", "Engage", "Establish", "Obligate", "Party", "Provision", "Resolve", "Specific",
            "Attract", "Compare", "Competition", "Consume", "Convince", "Currently", "Fad", "Inspiration", "Market", "Persuasion", "Productive", "Satisfaction",
            "Characteristic", "Consequence", "Consider", "Cover", "Expiration", "Frequently", "Imply", "Promise", "Protect", "Reputation", "Require", "Variety",
            "Address", "Avoid", "Demonstrate", "Develop", "Evaluate", "Gather", "Offer", "Primarily", "Risk", "Strategy", "Strong", "Substitution",
            "Accommodate", "Arrangement", "Association", "Attend", "Get in touch", "Hold", "Location", "Overcrowded", "Register", "Select", "Session", "Take part in",
            "Access", "Allocate", "Compatible", "Delete", "Display", "Duplicate", "Failure", "Figure out", "Ignore", "Search", "Shut down", "Warning",
            "Affordable", "As needed", "Be in charge of", "Capacity", "Durable", "Initiative", "Physically", "Provider", "Recur", "Reduction", "Stay on top of", "Stock",
            "Appreciation", "Be made of", "Bring in", "Casually", "Code", "Expose", "Glimpse", "Out of", "Outdated", "Practice", "Reinforce", "Verbally",
            "Disk", "Facilitate", "Network", "Popularity", "Process", "Replace", "Revolution", "Sharp", "Skill", "Software", "Store", "Technically",
            "Assemble", "Beforehand", "Complication", "Courier", "Express", "Fold", "Layout", "Mention", "Petition", "Proof", "Register", "Revise",
            "Abundant", "Accomplishment", "Bring together", "Candidate", "Come up with", "Commensurate", "Match", "Profile", "Qualification", "Recruit", "Submit", "Time-consuming",
            "Ability", "Apply", "Background", "Be ready for", "Call in", "Confidence", "Constantly", "Expert", "Follow up", "Hesitant", "Present", "Weakly",
            "Conduct", "Generate", "Hire", "Keep up with", "Look up to", "Mentor", "On track", "Reject", "Set up", "Success", "Training", "Update",
            "Basis", "Benefit", "Compensate", "Delicately", "Eligible", "Flexibly", "Negotiate", "Raise", "Retire", "Vested", "Wage", "Be aware of",
            "Achievement", "Contribute", "Dedication", "Look forward to", "Look to", "Loyal", "Merit", "Obviously", "Productive", "Promote", "Recognition", "Value",
            "Bargain", "Bear", "Behavior", "Checkout", "Comfort", "Expand", "Explore", "Item", "Mandatory", "Merchandise", "Strictly", "Trend",
            "Diversify", "Enterprise", "Essentially", "Everyday", "Function", "Maintain", "Obtain", "Prerequisite", "Quality", "Smooth", "Source", "Stationery",
            "Accurately", "Carrier", "Fulfill", "Catalog", "Integral", "Inventory", "Minimize", "On hand", "Remember", "Ship", "Sufficiently", "Supply",
            "Charge", "Compile", "Customer", "Discount", "Efficient", "Estimate", "Impose", "Mistake", "Order", "Promptly", "Rectify", "Terms",
            "Adjustment", "Automatically", "Rucial", "Discrepancy", "Disturb", "Liability", "Reflection", "Run", "Scan", "Subtract", "Tedious", "Verify",
            "Accept", "Balance", "Borrow", "Cautiously", "Deduct", "Dividend", "Down payment", "Mortgage", "Restricted", "Take out", "Transaction",
            "Accounting", "Accumulate", "Asset", "Audit", "Budget", "Build up", "Client", "Debt", "Outstanding", "Profitably", "Econcile", "Turnover",
            "Aggressively", "Attitude", "Commit", "Conservative", "Fund", "Invest", "Long-term", "Portfolio", "Pull out", "Resource", "Return", "Wisely",
            "Calculation", "Deadline", "File", "Fill out", "Give up", "Joint", "Owe", "Penalty", "Preparation", "Refund", "Spouse", "Withhold",
            "Desire", "Detail", "Forecast", "Level", "Overall", "Perspective", "Project", "Realistic", "Target", "Translation", "Typically", "Yield",
            "Adhere to", "Agenda", "Bring up", "Conclude", "Go ahead", "Goal", "Lengthy", "Matter", "Periodically", "Priority", "Progress", "Waste",
            "Brand", "Conform", "Defect", "Enhance", "Garment", "Inspect", "Perceptive", "Repel", "Take back", "Throw out", "Uniformly", "Wrinkle",
            "Anxious", "Ascertain", "Assume", "Decade", "Examine", "Experiment", "Logical", "Research", "Responsibility", "Solve", "Supervisor", "Systematically",
            "Apprehensive", "Circumstance", "Condition", "Due to", "Fluctuate", "Get out of", "Indicator", "Lease", "Lock into", "Option", "Subject to", "Occupy", "Appeal",
            "Arrive", "Compromise", "Daringly", "Familiar", "Guide", "Majority", "Mix", "Rely", "Secure", "Subjective", "Suggestion", "Basis", "Complete", "Excite", "Flavor",
            "Forget", "Ingredient", "Judge", "Mix-up", "Patron", "Predict", "Burden", "Commonly", "Delivery", "Elegance", "Fall to", "Impress", "Individual", "List", "Multiple",
            "Narrow", "Pick up", "Settle", "Accustom to", "Apprentice", "Culinary", "Demand", "Draw", "Incorporate", "Nflux", "Method", "Outlet", "Profession", "Relinquish",
            "Theme", "Assist", "Coordinate", "Dimension", "Exact", "General", "Ideally", "Lead time", "Plan", "Proximity", "Regulate", "Site", "Stage", "Agent", "Announcement",
            "Beverage", "Blanket", "Board", "Claim", "Delay", "Depart", "Embarkation", "Itinerary", "Prohibit", "Valid", "Deal with", "Destination", "Distinguish", "Economize",
            "Equivalent", "Excursion", "Expense", "Extend", "Prospective", "Situation", "Substantially", "System", "Comprehensive", "Deluxe", "Directory", "Duration", "Entitle",
            "Fare", "Offset", "Operate", "Punctually", "Relatively", "Emainder", "Remote", "Advanced", "Chain", "Check in", "Confirm", "Expect", "Housekeeper", "Notify",
            "Preclude", "Quote", "Rate", "Reservation", "Service", "Busy", "Coincide", "Confusion", "Contact", "Disappoint", "Intend", "License", "Nervously", "Optional", "Tempt",
            "Thrill", "Tier", "Attainment", "Combine", "Continue", "Description", "Disperse", "Entertainment", "Influence", "Range", "Release", "Representation", "Separately", "Successive",
            "Action", "Approach", "Audience", "Creative", "Dialogue", "Element", "Experience", "Occur", "Perform", "Rehearse", "Review", "Sell out", "Available", "Broaden", "Category",
            "Disparate", "Divide", "Favor", "Instinct", "Prefer", "Reason", "Relaxation", "Taste", "Urge", "Acquire", "Admire", "Collection", "Criticism", "Express", "Fashion", "Leisure",
            "Respond", "Schedule", "Significant", "Specialize", "Spectrum", "Assignment", "Choose", "Constantly", "Constitute", "Decision", "Disseminate", "Impact", "In-depth", "Investigate",
            "Link", "Subscribe", "Thorough", "Annually", "Appointment", "Assess", "Diagnose", "Effective", "Instrument", "Manage", "Prevent", "Recommendation", "Record", "Refer", "Serious",
            "Aware", "Catch up", "Distraction", "Encouragement", "Evident", "Habit", "Illuminate", "Irritate", "Overview", "Position", "Regularly", "Restore", "Allow", "Alternative", "Aspect",
            "Concern", "Emphasize", "Incur", "Personnel", "Policy", "Portion", "Regardless", "Salary", "Suit", "Admit", "Authorize", "Designate", "Escort", "Identify", "Mission", "Permit", "Pertinent",
            "Procedure", "Result", "Statement", "Usually", "Consult", "Control", "Convenient", "Detect", "Factor", "Interaction", "Limit", "Monitor", "Potential", "Sample", "Sense", "Volunteer"
    };

    public String[] VieWord = {
            "Tuân theo, tuân thủ", "Hợp đồng, giao kèo", "Đồng ý, tán thành", "Sự chắc chắn", "Sự hủy bỏ, sự bãi bỏ", "Quyết định, xác định", "Tham gia,cam kết, Sự hứa hẹn", "Thiết lập, xác minh", "Bắt buộc, ép buộc", "Buổi liên hoan, buổi tiệc", "Sự dự trữ, điều khoản",
            "Giải quyết", "Riêng biệt,đặc trưng", "Hấp dẫn, lôi cuốn, thu hút", "So sánh, đối chiếu", "Cạnh tranh, thi đấu", "Tiêu thụ, tiêu dùng", "Thuyết phục", "Hiện thời, hiện nay, lúc này", "Dở hơi, gàn dở", "Truyền cảm hứng, gây cảm hứng", "Thị trường, chợ, nơi mua bán sản phẩm",
            "Thuyết phục, làm cho tin", "Sản xuất", "Sự làm thỏa mãn, sự hài lòng", "Đặc trưng, đặc điểm", "Kết quả, hậu quả, hệ quả", "Cân nhắc, suy xét", "Che, phủ, trùm, bọc", "Sự mãn hạn, sự hết hạn, sự kết thúc", "Thường xuyên", "Ngụ ý, hàm ý, ẩn ý", "Hứa hẹn, cam đoan", "Bảo vệ, bảo hộ",
            "Danh tiếng, thanh danh", "Đòi hỏi, yêu cầu", "Đa dạng, nhiều thứ/loại/vẻ khác nhau", "Địa chỉ, diễn văn, sự khôn khéo", "Tránh, tránh khỏi", "Bày tỏ, biểu lộ, cho thấy, chứng minh", "Phát triển, tiến triển", "Đánh giá, định giá", "Tập hợp, tụ tập", "Đề xuất", "Trước hết, đầu tiên",
            "Sự nguy hiểm, sự rủi ro", "Chiến lược", "Khỏe, mạnh, tốt, bền, kiên cố", "Sự đổi, sự thay thế", "Điều tiết, điều chỉnh, thu xếp(v)", "Sắp xếp, sắp đặt(n)", "Hội, hội liên hiệp, đoàn thể", "Tham dự, có mặt", "Liên lạc với, tiếp xúc với, giữ quan hệ với, có dính líu đến", "Cầm, nắm, giữ",
            "Vị trí", "Chật ních, đông nghịt", "Đăng ký", "Chọn lựa", "Phiên, kỳ, buổi (họp, học)", "Tham dự, tham gia", "Sự/quyền truy cập", "Phân phối, phân phát", "Tương thích, tương hợp", "Xóa đi, bỏ đi", "Hiển thị, biểu lộ, phô bày", "Gấp đôi, nhân đôi", "Hỏng, thiếu, yếu, trượt, thất bại",
            "Đoán ra, tính toán ra", "Bỏ qua, phớt lờ", "Tìm kiếm, tìm hiểu", "Ngừng lại; tắt máy, ngừng hoạt động", "Cảnh báo", "Có đủ điều kiện (sức lực/thời gian/tiền bạc)", "Khi cần, lúc cần, cần thiết", "Chịu trách nhiệm về", "Sức chứa, dung tích, khả năng chứa đựng", "Bền, lâu", "Bắt đầu, khởi đầu",
            "Về thân thể/cơ thể/thể chất", "Người cung cấp, nhà cung cấp", "Tái diễn, tái phát", "Giảm, hạ, thu nhỏ, hạ thấp", "Nắm bắt tình hình", "Kho/hàng dự trữ, vốn, cổ phần", "Đánh giá, sự cảm kích", "Làm bằng (cái gì)", "Thuê, mướn, tuyển dụng, dẫn tới", "Bình thường", "Quy định, quy tắc, luật lệ, đạo lý",
            "Phơi bày, bộc lộ, phô ra, trưng bày", "Nhìn lướt qua, thoáng qua", "Hết, mất, không còn", "Hết hạn; lỗi thời, lạc hậu", "Thực hành, rèn luyện, tập luyện", "Tăng cường, củng cố", "Bằng miệng, bằng lời nói", "Đĩa", "Làm cho dễ dàng, làm cho thuận tiện", "Kết nối, liên kết, mạng lưới",
            "Phổ biến, nổi tiếng, được yêu mến", "Quá trình, xử lý", "Thay thế", "Vòng, tua, sự xoay vòng, cuộc cách mạng", "Sắc, bén, sắc nét, thình lình", "Kỹ năng, kỹ xảo", "Phần mềm", "Lưu trữ", "Về mặt kỹ thuật", "Thu thập, lắp ráp, tập hợp", "Sẵn, có sẵn, trước, sớm", "Sự phức tạp, sự rắc rối",
            "Người đưa tin, người đưa thư, người chuyển phát", "Nhanh, hỏa tốc, tốc hành", "Nếp gấp, gấp lại", "Sự bổ trí", "Sự đề cập", "Đơn kiến nghị, đơn thỉnh cầu", "Bằng chứng, chứng cớ", "Đăng ký, sổ sách", "Xem lại, duyệt lại", "Nhiều, phong phú", "Thành tựu, thành tích", "Nhóm lại, họp lại",
            "Ứng cử viên, thí sinh, người dự thi", "Đưa ra, phát hiện, khám phá, ý định", "(+with) xứng với, tương xứng với", "Hợp nhau, tương ứng, địch thủ", "Tiểu sử sơ lược, bản tóm lược các đặc tính", "Tư cách, khả năng, năng lực(để làm cái gì)", "Lính mới, nhân viên mới(n)", "Trình, đệ trình",
            "Tốn nhiều thời gian", "Năng lực, khả năng", "Nộp, ứng tuyển, áp dụng", "Kiến thức, kinh nghiệm, quá trình đào tạo", "Sẵn sàng cho", "Yêu cầu, mời tới", "Sự tin cậy, tin tưởng", "Luôn luôn, liên tục, liên miên", "Chuyên gia, chuyên viên", "Theo sau, bám miết", "Lưỡng lự, ngập ngừng",
            "Đưa ra, bày tỏ, giới thiệu", "Một cách yếu ớt, yếu, ốm yếu", "Tiến hành, cư xử", "Sinh ra, đẻ ra, làm ra, tạo ra, phát ra", "Thuê, mướn", "Theo kịp, bắt kịp", "Tôn kính, kính trọng, khâm phục", "Người cố vấn (dày dạn kinh nghiệm)", "Theo dõi, đi tìm", "(v) vật bị loại", "Thiết lập, tạo dựng",
            "Thành công, thành đạt, thắng lợi", "Rèn luyện, tập luyện, huấn luyện", "Cập nhật", "Nền tảng", "Chế độ đãi ngộ", "Bồi thường", "Thận trọng, lịch thiệp", "Thích hợp", "Linh hoạt", "Thương lượng", "Sự tăng lên", "Nghỉ hưu", "Được bảo đảm", "Tiền công", "Am hiểu, nhận biết", "Thành tích", "Đóng góp",
            "Sự cống hiến", "Mong đợi", "Trông cậy vào", "Trung thành", "Công lao", "Hiển nhiên", "Có năng suất", "Thăng tiến", "Sự thừa nhận", "Định giá", "Mặc cả, món hời", "Chịu đựng", "Hành vi", "Sự thanh toán", "Sự thoải mái", "Mở rộng, phát triển", "Khảo sát", "Mục, mặt hằng", "Bắt buộc", "Hàng hoá",
            "Nghiêm khắc", "Xu hướng", "Thay đổi", "Công trình, dự án lớn", "Cần thiết", "Thường ngày", "Chức năng(v)", "Bảo quản", "Đạt được", "Điều kiện tiên quyết", "Chất lượng", "Nhẵn, trơn", "Nguồn gốc", "Đồ dùng văn phòng", "Một cách chính xác", "Người/vật/hãng/công ty vận chuyển", "Thực hiện",
            "Bản liệt kê, danh mục", "Tính toàn bộ", "Sự kiểm kê", "Giảm thiểu", "Có sẵn", "Ghi nhớ", "Vận chuyển", "Có đủ", "Cung cấp", "(v) tính phí, (n) thù lao", "Soạn, soạn thảo", "Khách hang", "Khuyến mãi", "Có hiệu quả", "Ước lượng, ước tính", "Bắt gắnh vác", "Lỗi, sai", "Đặt hàng", "Nhanh chóng",
            "Sửa cho đúng", "Điều kiện, điều khoản", "Điều chỉnh", "Tự động", "Cốt yếu, chủ yếu", "Khác nhau, trái ngược nhau", "Quấy rầy", "Trách nhiệm", "Phản chiếu, phản xạ", "Chạy, vận hành", "Xem lướt, xem qua", "Trừ đi, khấu trừ", "Chán ngắt", "Kiểm tra lại", "Nhận, chấp nhận", "Sự cân bằng", "Vay, mượn",
            "Thận trọng, cẩn thận", "Lấy đi, trừ đi, khấu trừ", "Tiền lãi cổ phần", "Phần tiền trả trước ban đầu", "Sự cầm cố, sự thế chấp", "Bị hạn chế, bị giới hạn", "Rút (tiền)", "Sự giao dịch", "Công việc kế toán", "Tích lũy", "Tài sản, của cải", "(n) sự kiểm toán", "Ngân sách, ngân quỹ", "Tăng cường, gom lại, tích lại",
            "Khách, khách hàng", "Nợ, món nợ", "Còn tồn tại", "Có lợi, sinh lợi, sinh lãi", "Hòa giải, giảng hòa", "Doanh số, doanh thu", "Hùng hổ, tháo vát", "Quan điểm, thái độ", "Gửi, giao, giao phó", "Bảo thủ", "Nguồn tiền, quỹ dự trữ, (v) tài trợ", "Đầu tư", "Dài hạn, dài ngày", "Danh mục đầu tư",
            "Sự rút lui", "Tài nguyên, tài sản", "Tiền lãi, tiền lời", "Khôn ngoan, từng trải", "Dự tính", "Thời hạn chót", "Tập tin", "(điền)hoàn tất, hoàn thành", "Từ bỏ, tạm dừng", "Chung, cùng", "Nợ, mắc nợ, mang ơn", "Phạt, hình phạt", "Sự chuẩn bị, sửa soạn", "Trả lại, hoàn lại tiền", "Chồng, vợ", "Cố nín, kìm lại",
            "Thèm muốn", "Chi tiết, tỉ mỉ", "Dự báo", "Mức, cấp, cấp bậc, trình độ", "Toàn bộ, tổng thể", "Luật xa gần, luật phối cảnh", "Kế hoạch", "Hiện thực, thực tế", "Mục tiêu", "Bản dịch, bài dịch", "Tiêu biểu, điển hình", "Sản lượng", "Tuân thủ", "Nhật ký công tác, chương trình nghị sự", "Đưa ra", "Chấm dứt, kết thúc",
            "Tiến hành", "Mục đích, mục tiêu", "Lâu, dài, dài dòng", "Nội dung, sự kiện", "Định kỳ, thường kỳ", "Sự ưu tiên", "(v) tiến tới, tiến triển, phát triển", "Sự lãng phí", "Nhãn hiệu", "Tuân thủ, làm cho phù hợp", "Khuyết điểm", "Nâng cao, tăng cường", "Quần áo", "Kiểm tra", "Nhận thức được", "Chống lại", "Rút lui, rút lại",
            "Vứt bỏ, bỏ đi, đuổi đi", "Đồng đều thống nhất", "Nếp nhăn, nhàu", "Lo âu, băn khoăn", "Biết chắc, xác định rõ ràng", "Giả sử, cho rằng", "Thập niên", "Khám xét, xem xét", "Làm thí nghiệm", "Hợp lý, hợp với logic", "Sự nghiên cứu", "Trách nhiệm, bổn phận", "Giải, giải quyết, làm sáng tỏ", "Người giám sát",
            "Có hệ thống, có phương pháp", "Sợ hãi", "Trường hợp, hoàn cảnh", "Điều kiện, hoàn cảnh", "Bởi, vì, do", "Dao động", "Thôi, mất, bỏ, từ bỏ, rời bỏ, tránh né", "Người/vật/chất chỉ thị", "Cho thuê", "Nhốt, giam, ràng buộc chặt", "Sự/quyền lựa chọn, được chọn", "Lệ thuộc vào", "Sở hữu, chiếm hữu", "Kêu gọi, cầu khẩn", "Đến, đi đến, tới nơi",
            "Sự thỏa hiệp", "Táo bạo, cả gan", "Quen thuộc, thân thuộc", "Hướng dẫn", "Đa số, phần lớn", "Trộn lẫn, pha lẫn", "Dựa vào, tin cậy vào", "An toàn", "Chủ quan", "Đề nghị, ý kiến", "Cơ bản, cơ sở", "Hoàn thành, đầy đủ", "Kích thích, kích động", "Mùi vị, hương vị", "Quên", "Thành phần", "Xét xử, phân xử", "Sự lộn xộn, sự hỗn độn",
            "Người bảo trợ", "Nói trước", "Gánh nặng", "Thường thường", "Giao hàng, phân phát", "Thanh lịch, tao nhã", "Bắt đầu vào việc", "Gây ấn tượng", "Cá nhân", "Danh sách", "Nhiều, nhiều phần", "Chật, hẹp", "Đón (ai đó/cái gì)", "Ngồi, đậu, bố trí", "Làm cho quen, tập cho quen", "Người học việc", "(thuộc) nấu nướng", "Đòi hỏi, yêu cầu",
            "Vẽ, vạch, thảo ra", "Kết hợp chặt chẽ", "Sự chảy vào, sự tràn vào", "Phương pháp, cách thức", "Chỗ thoát ra, lối ra, lối thoát", "Nghề, nghề nghiệp", "Bỏ, từ bỏ, buông, thả", "Chủ đề, đề tài", "Giúp, giúp đỡ, trợ giúp", "Phối hợp, kết hợp", "Kích thước, chiều, cỡ, khổ", "Chính xác, đúng, đúng đắn", "Chung, tổng quát", "Lý tưởng, đúng như ý tưởng",
            "Khoảng thời gian ở giữa bắt đầu và kết thúc của một quá trình", "Kế hoạch", "Sự gần gũi", "Điều chỉnh", "Nơi, chỗ, vị trí, địa điểm", "Trình diễn, dàn cảnh", "Đại lý", "(sự/lời) thông báo", "Đồ uống (trừ nước lọc)", "Mềm, chăn, lớp phủ", "Lên tàu/máy bay/xe lửa", "Nhận lại, lấy lại", "Chậm trễ, trì hoãn, hoãn lại", "Rời khỏi, khởi hành",
            "(sự/quá trình) lên tàu, cho lên tàu", "Lịch trình", "Ngăn cấm, ngăn chặn", "Có giá trị, có hiệu lực", "Giải quyết, đối phó", "Nơi đến, nơi tới", "Phân biệt, nhận ra", "Tiết kiệm", "Tương đương", "Chuyến thăm quan", "Phí tốn, chi phí", "Kéo dài (thời hạn)", "Tương lai, triển vọng", "Tình huống, tình hình", "Đáng kể, về thực chất", "Hệ thống",
            "Bao hàm", "Xa xỉ, xa hoa", "Danh bạ", "Khoảng thời gian (tồn tại một sự việc)", "Cho phép làm cái gì", "Cước phí", "Bù lại, bù đắp", "Hoạt động", "Đúng giờ, không chậm trễ", "Tương đối", "Phần còn lại", "Xa, xa xôi, xa xăm", "Nâng cao, tiến bộ", "Chuỗi (khách sạn/nhà hàng)", "Làm thủ tục đăng ký", "Xác nhận, chứng thực", "Mong chờ, mong đợi",
            "Quản gia, người coi nhà", "Thông báo, khai báo", "Loại trừ, trừ bỏ, ngăn ngừa", "Sự trích dẫn, lời trích dẫn", "Mức, giá", "Sự dành trước, sự dự phòng", "Dịch vụ, sự phục vụ", "Bận, bận rộn", "Trùng khớp, trùng hợp", "Lộn xộn, hỗn loạn", "Chạm, tiếp xúc", "Thất vọng, chán ngán", "Định, dự định, có ý định", "Giấy chứng nhận, bản quyền", "Lo lắng, bồn chồn",
            "Tùy ý, tùy chọn", "Cám dỗ, khêu gợi; xúi giục", "Run lên, rùng mình", "Tầng lớp", "Đạt được, giành được", "Kết hợp, phối hợp", "Tiếp tục, tiếp diễn", "Sự diễn tả", "Giải tán, phân tán", "Giải trí, tiêu khiển", "Ảnh hưởng đến", "Vùng, phạm vi", "Công bố, phát hành", "Đại diện, thay mặt", "Tách rời, tách ra", "Kế tiếp, liên tiếp", "Hành động",
            "Tiến gần, tiếp cận", "Khán giả, thính giả, độc giả", "Sáng tạo", "Cuộc đối thoại, giai thoại", "Yếu tố, nguyên tố", "Kinh nghiệm, từng trải", "Xuất hiện, Xảy ra, xảy đến", "Thực hiện, thi hành, trình bày", "Diễn tập, nhắc lại, kể lại", "Sự phê bình, lời phê bình", "Hết vé", "Sẵn có, sẵn sang", "Mở rộng, nới rộng", "Loại, hạng", "Khác biệt, khác loại",
            "Chia ra, phân chia", "Chiếu cố, thiên vị", "Năng khiếu, thiên hướng", "Thích hơn, ưa hơn", "Lý do, lý lẽ", "Thư giãn, giải trí", "Vị giác, nếm, thưởng thức", "Thúc giục, thúc đẩy", "Đạt được, thu được", "Khâm phục, thán phục", "Sưu tầm, sự thu thập", "(sự/lời) phê bình", "Bày tỏ, biểu lộ", "Thời trang, mốt", "Nhàn rỗi", "Hồi âm, phản hồi",
            "Thời gian biểu, lịch trình", "Quan trọng, trọng đại", "Chuyên môn hóa", "Sự phân bổ theo tính chất", "Giao việc, phân công", "Chọn, chọn lựa", "Trung thành, chung thủy", "Tạo thành, thành lập", "Sự quyết định, sự giải quyết", "Truyền bá, phổ biến", "Sự va chạm", "Cẩn thận, tỉ mỉ", "Điều tra, nghiên cứu", "Nối, liên kết",
            "Đặt mua một cái gì đó định kỳ, đăng ký", "Thấu đáo, triệt để, hoàn toàn", "Hàng năm", "Cuộc hẹn", "Định giá", "Chẩn đoán", "Kết quả, tác dụng", "Dụng cụ, công cụ", "Quản lý, trông nom", "Ngăn ngừa, ngăn chặn", "Giới thiệu, sự tiến cử", "Hồ sơ, bản ghi lại", "Tham khảo", "Nghiêm trọng", "Biết, nhận thấy",
            "Làm kịp, kịp thời gian", "Sự sao nhãng", "Khuyến khích", "Hiển nhiên, rõ ràng", "Thói quen, tập quán", "Chiếu sáng, soi sang", "Kích thích, làm tấy lên", "Chung, tổng quan", "Vị trí, chỗ", "Đều đặn", "Phục hồi, khôi phục", "Cho phép, để cho", "Xen kẽ, thay phiên", "Vẻ, bề ngoài, diện mạo",
            "Liên quan, dính líu", "Nhấn mạnh, làm nổi bật", "Chịu, gánh, mắc, bị", "Cán bộ, nhân viên", "Chính sách, đường lối", "Phần, phần chia", "Không quan tâm, bất kể", "Tiền lương (khác tiền công)", "Làm cho phù hợp", "Thú nhận, thừa nhận", "Cho quyền", "Chỉ rõ, định rõ", "Đội hộ tống",
            "Nhận ra", "Sứ mệnh, nhiệm vụ", "Giấy phép, sự cho phép, quyền", "Thích hợp, thích đáng, đúng chỗ", "Thủ tục", "Kết quả, đáp số", "Sự bày tỏ, sự trình bày", "Thông thường, thường lệ", "Hỏi ý kiến, tham khảo", "Kiểm tra, kiểm soát", "Thuận lợi, thuận tiện", "Dò ra, tìm ra",
            "Nhân tố, yếu tố", "Sự tương tác, ảnh hưởng lẫn nhau", "Giới hạn, hạn định, ranh giới", "Màn hình vi tính", "Tiềm tàng, tiềm năng", "Mẫu, hàng mẫu, ví dụ", "Giác quan, cảm giác", "Tình nguyện viên"
    };


}