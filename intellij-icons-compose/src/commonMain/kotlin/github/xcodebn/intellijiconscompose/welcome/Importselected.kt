package github.xcodebn.intellijiconscompose.welcome

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Importselected: ImageVector
    get() {
        if (_Importselected != null) return _Importselected!!

        _Importselected = ImageVector.Builder(
            name = "Importselected",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19f, 3f)
                lineTo(21f, 5f)
                lineTo(15f, 12f)
                lineTo(18f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                lineTo(12f, 9f)
                lineTo(19f, 3f)
                close()
                moveTo(6f, 6f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _Importselected!!
    }

private var _Importselected: ImageVector? = null

