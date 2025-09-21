package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Errorpoint: ImageVector
    get() {
        if (_Errorpoint != null) return _Errorpoint!!

        _Errorpoint = ImageVector.Builder(
            name = "Errorpoint",
            defaultWidth = 6.0.dp,
            defaultHeight = 6.0.dp,
            viewportWidth = 6.0f,
            viewportHeight = 6.0f
        ).apply {

        }.build()

        return _Errorpoint!!
    }

private var _Errorpoint: ImageVector? = null

