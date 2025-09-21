package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dropdowngutter: ImageVector
    get() {
        if (_Dropdowngutter != null) return _Dropdowngutter!!

        _Dropdowngutter = ImageVector.Builder(
            name = "Dropdowngutter",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 10f)
                lineTo(13f, 13f)
                lineTo(8f, 13f)
                close()
            }
        }.build()

        return _Dropdowngutter!!
    }

private var _Dropdowngutter: ImageVector? = null

