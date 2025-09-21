package github.xcodebn.intellijiconscompose.welcome

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val OpenDark: ImageVector
    get() {
        if (_OpenDark != null) return _OpenDark!!

        _OpenDark = ImageVector.Builder(
            name = "OpenDark",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFCCE2FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 4f)
                horizontalLineTo(9f)
                lineTo(11f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                lineTo(2f, 16f)
                verticalLineTo(10f)
                verticalLineTo(7f)
                verticalLineTo(4f)
                close()
                moveTo(23f, 12f)
                horizontalLineTo(6f)
                lineTo(2f, 19f)
                horizontalLineTo(19f)
                lineTo(23f, 12f)
                close()
            }
        }.build()

        return _OpenDark!!
    }

private var _OpenDark: ImageVector? = null

