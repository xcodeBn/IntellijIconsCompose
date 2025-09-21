package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PowersavemodeDark: ImageVector
    get() {
        if (_PowersavemodeDark != null) return _PowersavemodeDark!!

        _PowersavemodeDark = ImageVector.Builder(
            name = "PowersavemodeDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 3f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                horizontalLineTo(1f)
                verticalLineTo(3f)
                close()
                moveTo(12f, 5f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _PowersavemodeDark!!
    }

private var _PowersavemodeDark: ImageVector? = null

