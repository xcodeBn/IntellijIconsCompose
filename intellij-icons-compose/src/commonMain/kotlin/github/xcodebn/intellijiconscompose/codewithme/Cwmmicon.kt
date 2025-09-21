package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cwmmicon: ImageVector
    get() {
        if (_Cwmmicon != null) return _Cwmmicon!!

        _Cwmmicon = ImageVector.Builder(
            name = "Cwmmicon",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 8f)
                horizontalLineTo(12f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineToRelative(2f)
                verticalLineTo(13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 1f)
                verticalLineTo(8f)
                verticalLineTo(3f)
                close()
                moveTo(9f, 10f)
                close()
            }
        }.build()

        return _Cwmmicon!!
    }

private var _Cwmmicon: ImageVector? = null

