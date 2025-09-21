package github.xcodebn.intellijiconscompose.welcome

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Createnewprojecttab: ImageVector
    get() {
        if (_Createnewprojecttab != null) return _Createnewprojecttab!!

        _Createnewprojecttab = ImageVector.Builder(
            name = "Createnewprojecttab",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF3996FB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 2f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(22f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _Createnewprojecttab!!
    }

private var _Createnewprojecttab: ImageVector? = null

