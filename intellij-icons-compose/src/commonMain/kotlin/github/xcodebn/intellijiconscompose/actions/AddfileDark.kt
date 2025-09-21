package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AddfileDark: ImageVector
    get() {
        if (_AddfileDark != null) return _AddfileDark!!

        _AddfileDark = ImageVector.Builder(
            name = "AddfileDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 1f)
                lineTo(3f, 5f)
                horizontalLineTo(7f)
                verticalLineTo(1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 14f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                verticalLineTo(1f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 11f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _AddfileDark!!
    }

private var _AddfileDark: ImageVector? = null

