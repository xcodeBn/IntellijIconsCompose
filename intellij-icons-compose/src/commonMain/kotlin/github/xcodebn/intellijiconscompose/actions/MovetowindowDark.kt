package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MovetowindowDark: ImageVector
    get() {
        if (_MovetowindowDark != null) return _MovetowindowDark!!

        _MovetowindowDark = ImageVector.Builder(
            name = "MovetowindowDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 2f)
                lineTo(14f, 2f)
                lineTo(14f, 14f)
                lineTo(2f, 14f)
                lineTo(2f, 2f)
                close()
                moveTo(3f, 3f)
                lineTo(3f, 13f)
                lineTo(13f, 13f)
                lineTo(13f, 3f)
                lineTo(3f, 3f)
                close()
                moveTo(13f, 10f)
                lineTo(13f, 13f)
                lineTo(3f, 13f)
                lineTo(3f, 10f)
                lineTo(13f, 10f)
                close()
            }
        }.build()

        return _MovetowindowDark!!
    }

private var _MovetowindowDark: ImageVector? = null

