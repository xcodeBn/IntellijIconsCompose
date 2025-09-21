package github.xcodebn.intellijiconscompose.gutter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WriteaccessDark: ImageVector
    get() {
        if (_WriteaccessDark != null) return _WriteaccessDark!!

        _WriteaccessDark = ImageVector.Builder(
            name = "WriteaccessDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 2f)
                lineTo(8f, 0f)
                lineTo(5f, 3f)
                lineTo(6f, 3f)
                lineTo(8f, 1f)
                lineTo(11f, 4f)
                lineTo(8f, 8f)
                lineTo(6f, 6f)
                lineTo(5f, 6f)
                lineTo(8f, 9f)
                lineTo(12f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 7f)
                lineTo(6f, 4f)
                lineTo(4f, 2f)
                lineTo(4f, 4f)
                lineTo(0f, 4f)
                lineTo(0f, 5f)
                lineTo(4f, 5f)
                close()
            }
        }.build()

        return _WriteaccessDark!!
    }

private var _WriteaccessDark: ImageVector? = null

