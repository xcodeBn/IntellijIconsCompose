package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WriteAccess: ImageVector
    get() {
        if (_WriteAccess != null) return _WriteAccess!!

        _WriteAccess = ImageVector.Builder(
            name = "WriteAccess",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(13f, 5f)
                lineTo(10f, 3f)
                lineTo(8f, 6f)
                lineTo(8f, 6f)
                lineTo(10f, 4f)
                lineTo(14f, 7f)
                lineTo(10f, 11f)
                lineTo(8f, 9f)
                lineTo(8f, 9f)
                lineTo(10f, 12f)
                lineTo(15f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(6f, 10f)
                lineTo(9f, 8f)
                lineTo(6f, 5f)
                lineTo(6f, 7f)
                lineTo(2f, 7f)
                lineTo(2f, 8f)
                lineTo(6f, 8f)
                close()
            }
        }.build()

        return _WriteAccess!!
    }

private var _WriteAccess: ImageVector? = null

