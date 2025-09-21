package github.xcodebn.intellijiconscompose.welcome

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Createnewprojecttabselected: ImageVector
    get() {
        if (_Createnewprojecttabselected != null) return _Createnewprojecttabselected!!

        _Createnewprojecttabselected = ImageVector.Builder(
            name = "Createnewprojecttabselected",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
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

        return _Createnewprojecttabselected!!
    }

private var _Createnewprojecttabselected: ImageVector? = null

