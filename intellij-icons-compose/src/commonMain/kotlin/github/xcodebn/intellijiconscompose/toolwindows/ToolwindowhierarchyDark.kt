package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ToolwindowhierarchyDark: ImageVector
    get() {
        if (_ToolwindowhierarchyDark != null) return _ToolwindowhierarchyDark!!

        _ToolwindowhierarchyDark = ImageVector.Builder(
            name = "ToolwindowhierarchyDark",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 4f)
                lineTo(4f, 4f)
                close()
            }
        }.build()

        return _ToolwindowhierarchyDark!!
    }

private var _ToolwindowhierarchyDark: ImageVector? = null

