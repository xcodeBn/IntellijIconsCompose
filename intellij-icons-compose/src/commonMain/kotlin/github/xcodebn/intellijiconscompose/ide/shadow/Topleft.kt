package github.xcodebn.intellijiconscompose.ide.shadow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Topleft: ImageVector
    get() {
        if (_Topleft != null) return _Topleft!!

        _Topleft = ImageVector.Builder(
            name = "Topleft",
            defaultWidth = 18.0.dp,
            defaultHeight = 14.0.dp,
            viewportWidth = 18.0f,
            viewportHeight = 14.0f
        ).apply {

        }.build()

        return _Topleft!!
    }

private var _Topleft: ImageVector? = null

